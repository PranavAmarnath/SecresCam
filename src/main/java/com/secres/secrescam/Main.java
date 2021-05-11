package com.secres.secrescam;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.SwingUtilities;

import com.formdev.flatlaf.FlatLightLaf;

public class Main {

    public static void main(String[] args) {
        System.setErr(new PrintStream(new OutputStream() {
            @Override
            public void write(int arg0) throws IOException {

            }
        }));
        
        SwingUtilities.invokeLater(() -> {
            FlatLightLaf.install();
            new View();
        });
    }
    
}
