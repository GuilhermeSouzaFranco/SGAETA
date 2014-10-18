/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.util;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.swing.ImageIcon;

/**
 *
 * @author guilherme.franco
 */
public class ByteImg {
    public ImageIcon byteImg(byte[] i) {
        InputStream is = new ByteArrayInputStream(i);
        Image image = new ImageIcon(i).getImage();
        ImageIcon icon = new ImageIcon(image);
        return icon;
    }}