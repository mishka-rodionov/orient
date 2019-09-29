package com.rodionov.orient.modules.qr_scanner.presenter

import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.modules.qr_scanner.model.QRScannerInteractor
import com.rodionov.orient.modules.qr_scanner.view.QRScannerFragment
import com.rodionov.orient.modules.qr_scanner.view.QRScannerView

/**
 * Created by rodionov on 11.09.2019.
 */
class QRScannerPresenter(view: QRScannerFragment, interactor: QRScannerInteractor) :
    BasePresenter<QRScannerView, QRScannerInteractor>(view, interactor) {

    fun asdasd(){
        view?.show()
    }
}