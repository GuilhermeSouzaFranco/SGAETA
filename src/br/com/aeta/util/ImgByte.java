/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aeta.util;

import br.com.aeta.model.Global;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author guilherme.franco
 */
public class ImgByte {

    public void imgByte(String imagem) {
        try {
            BufferedImage bi = ImageIO.read(new File(imagem));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bi, "jpg", baos);
            byte[] res = baos.toByteArray();
            
            System.out.println("correto");
            Global.img = res;
        } catch (IOException ex) {
            Logger.getLogger(ImgByte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
