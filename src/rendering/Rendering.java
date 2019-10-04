package rendering;

import static clas.Frame.Out;
import static clas.Init.AllGround;
import static clas.Init.Cof;
import static clas.Init.GamePlace;
import static clas.Init.GameScreen;
import static clas.Init.ImageS;
import static clas.Init.ScreenIcon;
import static clas.Init.ScreenPos;
import static entities.Uat.IW;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Rendering {

 public static void RenderGround() throws IOException {
  BufferedImage Overlay = new BufferedImage(GameScreen[0], GameScreen[1], 1);
  for (int x = 0; x < GameScreen[0] / ImageS; x++) {
   for (int y = 0; y < GameScreen[1] / ImageS; y++) {
    AllGround = RenderTile(x, y, GamePlace[x][y], Overlay);
   }
  }
 }

 public static void RenderAll() throws IOException {
  ScreenIcon = Cut(ScreenPos[0], ScreenPos[1], ScreenPos[0] + 1000, ScreenPos[1] + 1000, AllGround);
  Out.setIcon(new ImageIcon(Render2(RenderUat(Render1(Render0(ScreenIcon))))));
 }

 private static BufferedImage Render0(BufferedImage Base) throws IOException {
  return Base;
 }

 private static BufferedImage Render1(BufferedImage Base) throws IOException {
  return Base;
 }

 private static BufferedImage RenderUat(BufferedImage Base) throws IOException {
  return Base;
 }

 private static BufferedImage Render2(BufferedImage Base) throws IOException {
  return Base;
 }

 private static BufferedImage RenderTile(int tpx, int tpy, String texture, BufferedImage ReturnImage) throws IOException {
  tpx *= ImageS;
  tpy *= ImageS;
  texture += "";
  try {
   BufferedImage CurrentImage = updateToCof(ImageIO.read(new File(texture)));
   for (int x = 0; x < ImageS; x++) {
    for (int y = 0; y < ImageS; y++) {
     ReturnImage.setRGB(tpx + x, tpy + y, CurrentImage.getRGB(x, y));
    }
   }
  } catch (IOException iOException) {
   BufferedImage CurrentImage = updateToCof(ImageIO.read(new File(IW("null"))));
   for (int x = 0; x < ImageS; x++) {
    for (int y = 0; y < ImageS; y++) {
     ReturnImage.setRGB(tpx + x, tpy + y, CurrentImage.getRGB(x, y));
    }
   }
  }
  return ReturnImage;
 }

 private static BufferedImage updateToCof(BufferedImage InputImage) {
  BufferedImage CurrentImage = new BufferedImage(ImageS, ImageS, 1);
  for (int Xx = 0; Xx < ImageS; Xx++) {
   for (int Yy = 0; Yy < ImageS; Yy++) {
    CurrentImage.setRGB(Xx, Yy, InputImage.getRGB(Xx / (Cof + 1), Yy / (Cof + 1)));
   }
  }
  return CurrentImage;
 }

 private static BufferedImage Cut(int x, int y, int fx, int fy, BufferedImage InputImage) {
  BufferedImage CurrentImage = new BufferedImage(fx - x, fy - y, 1);
  for (int Xx = x; Xx < fx; Xx++) {
   for (int Yy = y; Yy < fy; Yy++) {
    CurrentImage.setRGB(Xx-x, Yy-y, InputImage.getRGB(Xx, Yy));
   }
  }
  return CurrentImage;
 }

}
