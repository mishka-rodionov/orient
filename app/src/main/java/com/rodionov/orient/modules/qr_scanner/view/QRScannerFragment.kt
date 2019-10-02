package com.rodionov.orient.modules.qr_scanner.view

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.DecodeCallback
import com.rodionov.orient.R
import com.rodionov.orient.base.BaseFragment
import com.rodionov.orient.modules.qr_scanner.presenter.QRScannerPresenter
import kotlinx.android.synthetic.main.qr_scanner_fragment.*

/**
 * Created by rodionov on 11.09.2019.
 */
class QRScannerFragment: BaseFragment<QRScannerPresenter>(), QRScannerView {

    private lateinit var codeScanner: CodeScanner

    override fun initPresenter() {
    }

    override fun show() {
        val x = 1
    }

    override fun getLayoutResource(): Int {
        return R.layout.qr_scanner_fragment
    }

    override fun requestData() {

    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val activity = requireActivity()
//        codeScanner = CodeScanner(activity, scannerView)
//
//        if(ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
//            ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.CAMERA), 10)
//        } else {
//            codeScanner.decodeCallback = DecodeCallback {
//                activity.runOnUiThread {
//                    Toast.makeText(activity, it.text, Toast.LENGTH_LONG).show()
//                }
//            }
//            scannerView.setOnClickListener {
//                codeScanner.startPreview()
//            }
//        }
//    }

    override fun initViews(view: View) {
        val activity = requireActivity()
//        codeScanner = CodeScanner(activity, scannerView)

        if(ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.CAMERA), 10)
        } else {
            codeScanner = CodeScanner(activity, scannerView)
            codeScanner.decodeCallback = DecodeCallback {
                activity.runOnUiThread {
                    Toast.makeText(activity, it.text, Toast.LENGTH_LONG).show()
                }
            }
            scannerView.setOnClickListener {
                codeScanner.startPreview()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        codeScanner.startPreview()
    }

    override fun onPause() {
        codeScanner.releaseResources()
        super.onPause()
    }
}