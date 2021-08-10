package com.example.takephotobasics.barcode

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.camera.core.*
import androidx.core.content.ContextCompat
import com.example.takephotobasics.BaseLensActivity
import com.example.takephotobasics.R
import kotlinx.android.synthetic.main.activity_lens.*
import kotlinx.android.synthetic.main.activity_camera.*

class BarcodeActivity : BaseLensActivity() {

    override val imageAnalyzer=BarcodeAnalyzer()
    override fun startScanner() {
        scanBarcode()
    }
    //private lateinit var imageAnalysis: ImageAnalysis



    private fun scanBarcode() {

        imageAnalysis.setAnalyzer(
            ContextCompat.getMainExecutor(this),
            imageAnalyzer
        )

    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//
//
////        btnStartScanner.setOnClickListener {
////            scanBarcode()
////        }
//
//    }

//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        if (requestCode == CAMERA_PERM_CODE) {
//            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                startCamera()
//            } else {
//                AlertDialog.Builder(this)
//                    .setTitle("Permission Error")
//                    .setMessage("Camera Permission not provided")
//                    .setPositiveButton("OK") { _, _ -> finish() }
//                    .setCancelable(false)
//                    .show()
//            }
//        }
//
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//    }
}