package clas;

import entities.Uat;
import static entities.Uat.GetTexture;
import static entities.Uat.IW;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Init {

 public static Object[][] UatBaseList = new Object[100][4];
 public static Object[][] UatInGameList = new Object[100][4];
 public static int[] ScreenBounds = {15 * (32), 15 * (32)};
 public static int[] ScreenPos = {0, 0};
 public static int Enum = 0;
 public static BufferedImage AllGround;
 public static int Cof;
 public static int StepLength;
 public static int ImageS;
 public static String[][] GamePlace = new String[40][40];
 public static BufferedImage[][] Plates = new BufferedImage[40][40];

 public static void Init() throws IOException {
  try {
   InitVar(2);
   InitUat();
   SetPlace();
  } catch (FileNotFoundException ex) {
  }
 }

 public static void InitVar(int newCof) {
  Cof = newCof;
  StepLength = 4 * (Cof + 1);
  ImageS = 32 * (Cof + 1);
 }

 private static void InitUat() {
  /*new Uat("Player", Enum, "azg:player", IW("player/R_00_00"));
  
   the last texture is NULL*/
  Uat uat = new Uat("NULL", Enum, "azg:null", IW("null"));
  /**/
  uat = new Uat("Dirt brick", Enum, "azg:plate:brick_dirt", IW("plates/brick_dirt"));
  uat = new Uat("Stone brick", Enum, "azg:plate:brick_stone", IW("plates/brick_stone"));
  uat = new Uat("Water", Enum, "azg:plate:water", IW("plates/water"));
  uat = new Uat("Planks", Enum, "azg:plate:planks", IW("plates/planks"));
  uat = new Uat("Brick", Enum, "azg:plate:brick", IW("plates/brick"));
 }

 private static void SetPlace() throws FileNotFoundException, IOException {
  BufferedReader f = new BufferedReader(new FileReader(new File("src/levels/level1.txt")));
  String[][] s = new String[GamePlace.length][GamePlace.length];
  for (int i = 0; i < GamePlace.length; i++) {
   s[i] = f.readLine().split(";");
   f.skip(1);
  }
  for (int x = 0; x < GamePlace.length; x++) {
   for (int y = 0; y < GamePlace.length; y++) {
    Plates[x][y] = ImageIO.read(new File(GetTexture(Integer.parseInt(s[y][x]))));
   }
  }
 }

 public static String InString(String text, String start, String finish) {
  String ret = text.substring(text.lastIndexOf(start));
  ret = ret.substring(0, ret.indexOf(finish));
  return ret;
 }

}
