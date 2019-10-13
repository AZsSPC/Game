package rendering;
import static clas.Frame.Out;
import static clas.Init.Cof;
import static clas.Init.GamePlace;
import static clas.Init.ImageS;
import static clas.Init.ScreenBounds;
import static clas.Init.ScreenPos;
import static clas.Init.StepLength;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Rendering{

 public static void RenderAll2(){
  try{
   Out.setIcon(new ImageIcon(Render2(Render1(Render0(
   new BufferedImage(ScreenBounds[0], ScreenBounds[1], 1), ScreenPos)))));
  }catch(IOException iOE){
  }
 }

 private static BufferedImage Render0(BufferedImage Base, int[] Pos) throws IOException{
  BufferedImage Plate = new BufferedImage(ImageS, ImageS, 1);
  int H = Base.getHeight() / ImageS + 1;
  int W = Base.getWidth() / ImageS + 1;
  for(int X = 0; X < W; X++){
   for(int Y = 0; Y < H; Y++){
	try{
	 Plate = ImageIO.read(new File(GamePlace[X + Pos[0] / StepLength][Y + Pos[1] / StepLength]));
	}catch(Exception e){
	 Plate = null;
	}
	//
	for(int x = 0; x < ImageS; x++){
	 for(int y = 0; y < ImageS; y++){
	  try{
	   Base.setRGB(X * ImageS + x, Y * ImageS + y, Plate.getRGB(x / (Cof + 1), y / (Cof + 1)));
	  }catch(Exception e){
	  }
	 }
	}
	//
   }
  }
  Base = Base;
  return Base;
 }

 private static BufferedImage Render1(BufferedImage Base) throws IOException{
  Base = Base;
  return Base;
 }

 private static BufferedImage Render2(BufferedImage Base) throws IOException{
  Base = Base;
  return Base;
 }

 /*
  public static void RenderGround(){
  try{
  BufferedImage Overlay = new BufferedImage(GameScreen[0], GameScreen[1], 1);
  for(int x = 0; x < GameScreen[0] / ImageS; x++){
  for(int y = 0; y < GameScreen[1] / ImageS; y++){
  AllGround = RenderTile(x, y, GamePlace[x][y], Overlay);
  }
  }
  }catch(IOException iOException){
  }
  }
 
  public static void RenderAll(){
  try{
  Out.setIcon(new ImageIcon(Cut(ScreenPos[0], ScreenPos[1],
  ScreenPos[0] + ScreenBounds[0], ScreenPos[1] + ScreenBounds[1],
  Render2(RenderUat(Render1(Render0(
  AllGround)))))));
  }catch(IOException iOE){
  }
  }
  

  private static BufferedImage RenderUat(BufferedImage Base) throws IOException{
  Base = DrawUat((int)(Math.random() * 500) + 200, (int)(Math.random() * 500) + 200, "player//R_00_00", Base);
  return Base;
  }

  private static BufferedImage RenderTile(int tpx, int tpy, String texture, BufferedImage ReturnImage) throws IOException{
  tpx *= ImageS;
  tpy *= ImageS;
  texture += "";
  try{
  BufferedImage CurrentImage = updateToCof(ImageIO.read(new File(texture)));
  for(int x = 0; x < ImageS; x++){
  for(int y = 0; y < ImageS; y++){
  ReturnImage.setRGB(tpx + x, tpy + y, CurrentImage.getRGB(x, y));
  }
  }
  }catch(IOException iOException){
  BufferedImage CurrentImage = updateToCof(ImageIO.read(new File(IW("null"))));
  for(int x = 0; x < ImageS; x++){
  for(int y = 0; y < ImageS; y++){
  ReturnImage.setRGB(tpx + x, tpy + y, CurrentImage.getRGB(x, y));
  }
  }
  }
  return ReturnImage;
  }

  private static BufferedImage DrawUat(int x, int y, String UatTexture, BufferedImage Base) throws IOException{
  BufferedImage Uat = updateUatSize(1, (updateToCof(ImageIO.read(new File(IW(UatTexture))))));
  int W = Uat.getWidth();
  int H = Uat.getHeight();
  x -= W / 2;
  y -= H / 2;
  int Yy = y;
  for(int X = 0; X < W; X++, x++){
  for(int Y = 0; Y < H; Y++, y++){
  try{
  if(Uat.getRGB(X, Y) != new Color(2, 1, 8).getRGB()){
  Base.setRGB(x, y, Uat.getRGB(X, Y));
  }
  }catch(Exception e){
  }
  }
  y = Yy;
  }
  return Base;
  }

  private static BufferedImage updateUatSize(int size, BufferedImage InputImage){
  int W = InputImage.getWidth();
  int H = InputImage.getHeight();
  BufferedImage CurrentImage = new BufferedImage(W * (size + 1), H * (size + 1), 1);
  for(int x = 0; x < W * (size + 1); x++){
  for(int y = 0; y < H * (size + 1); y++){
  CurrentImage.setRGB(x, y, InputImage.getRGB(x / (size + 1), y / (size + 1)));
  }
  }
  return CurrentImage;
  }

  private static BufferedImage updateToCof(BufferedImage InputImage){
  BufferedImage CurrentImage = new BufferedImage(ImageS, ImageS, 1);
  for(int x = 0; x < ImageS; x++){
  for(int y = 0; y < ImageS; y++){
  CurrentImage.setRGB(x, y, InputImage.getRGB(x / (Cof + 1), y / (Cof + 1)));
  }
  }
  return CurrentImage;
  }

  private static BufferedImage Cut(int x, int y, int fx, int fy, BufferedImage InputImage){
  BufferedImage CurrentImage = new BufferedImage(fx - x, fy - y, 1);
  for(int Xx = x; Xx < fx; Xx++){
  for(int Yy = y; Yy < fy; Yy++){
  CurrentImage.setRGB(Xx - x, Yy - y, InputImage.getRGB(Xx, Yy));
  }
  }
  return CurrentImage;
  }*/
}
