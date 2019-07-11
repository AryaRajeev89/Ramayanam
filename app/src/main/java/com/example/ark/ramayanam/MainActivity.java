package com.example.ark.ramayanam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //for loding PDF
        PDFView pdfView=findViewById(R.id.pdfView);
//        pdfView.fromUri(Uri)
//        or
//        pdfView.fromFile(File)
//        or
//        pdfView.fromBytes(byte[])
//        or
//        pdfView.fromStream(InputStream) // stream is written to bytearray - native code cannot use Java Streams
//        or
//        pdfView.fromSource(DocumentSource)
//        or

        pdfView.fromAsset("Ramayanam.pdf")
                .pages(0, 2, 1, 3, 3, 3) // all pages are displayed by default
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(true)
                .enableDoubletap(true)
                .defaultPage(0)

                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                .pageFitPolicy(FitPolicy.WIDTH)
                .load();
    }
}
