package com.rodionov.orient.modules.qr_scanner

import com.rodionov.orient.modules.qr_scanner.model.QRScannerInteractor
import com.rodionov.orient.modules.qr_scanner.presenter.QRScannerPresenter
import com.rodionov.orient.modules.qr_scanner.view.QRScannerFragment

/**
 * Created by rodionov on 12.09.2019.
 */
class QRScannerAssembler {

    fun assemble(view: QRScannerFragment){
        val interactor = QRScannerInteractor()
        val presenter = QRScannerPresenter(view = view, interactor = interactor)
        view.presenter = presenter
    }

}