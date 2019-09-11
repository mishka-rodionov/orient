package com.rodionov.orient.modules.qr_scanner.presenter

import com.rodionov.orient.base.BasePresenter
import com.rodionov.orient.modules.qr_scanner.model.QRScannerInteractor
import com.rodionov.orient.modules.qr_scanner.view.QRScannerFragment

/**
 * Created by rodionov on 11.09.2019.
 */
class QRScannerPresenter(view: QRScannerFragment, interactor: QRScannerInteractor) :
    BasePresenter<QRScannerFragment, QRScannerInteractor>(view, interactor) {

}