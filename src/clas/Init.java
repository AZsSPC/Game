package clas;

import entities.Uat;
import static entities.Uat.GetTexture;
import static entities.Uat.IW;
import java.awt.image.BufferedImage;
import java.io.IOException;
import static rendering.Rendering.RenderGround;

public class Init {

 public static BufferedImage ScreenIcon;
 public static int[] ScreenPos = {0, 0};
 public static BufferedImage AllGround;
 public static final int Cof = 3;
 public static final int ImageS = 16 * (Cof + 1);
 public static int Enum = 0;
 public static final int[] GameScreen = {ImageS * 30, ImageS * 30};
 public static String[][] GamePlace = new String[GameScreen[0] / ImageS][GameScreen[1] / ImageS];
 public static Object[][] UatLit = new Object[100][4];

 public static void Init() throws IOException {
  InitUat();
  RenderGround();
  SetUat();
 }

 private static void InitUat() {
  //new Uat("Player", Enum, "azg:player", IW("player/R_00_00"));
  Uat uat = new Uat("Brick", Enum, "azg:plate:brick", IW("plates/brick"));
  uat = new Uat("Dirt brick", Enum, "azg:plate:brick_dirt", IW("plates/brick_dirt"));
  uat = new Uat("Stone brick", Enum, "azg:plate:brick_stone", IW("plates/brick_stone"));
  uat = new Uat("Water", Enum, "azg:plate:water", IW("plates/water"));
  uat = new Uat("Planks", Enum, "azg:plate:planks", IW("plates/planks"));
  /*the last texture is NULL*/
  uat = new Uat("NULL", Enum, "azg:null", IW("null"));
 }

 private static void SetUat() {
  for (int x = 0; x < GameScreen[0] / ImageS; x++) {
   for (int y = 0; y < GameScreen[1] / ImageS; y++) {
    GamePlace[x][y] = GetTexture((int) (Math.random() * (Enum - 1)));
   }
  }
 }

 public static String InString(String text, String start, String finish) {
  String ret = text.substring(text.lastIndexOf(start));
  ret = ret.substring(0, ret.indexOf(finish));
  return ret;
 }

}
