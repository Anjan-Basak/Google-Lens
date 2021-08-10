package com.example.takephotobasics.imagelabeler

import androidx.camera.core.ImageAnalysis
import androidx.core.content.ContextCompat
import com.example.takephotobasics.BaseLensActivity

class ImageLabelingActivity: BaseLensActivity() {
    override val imageAnalyzer=ImageLabelAnalyzer()

    override fun startScanner() {
        startImageLabeling()
    }
    private fun startImageLabeling(){
        imageAnalysis.setAnalyzer(
            ContextCompat.getMainExecutor(this),
            imageAnalyzer
        )
    }
}