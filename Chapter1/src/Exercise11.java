//turn the AllTheColorsOfTheRainbow code fragments into a working program
class AllTheColorsOfTheRainbow {
  int anIntegerRepresentingColors;
  void changeTheHueOfTheColor(int newHue) {
    anIntegerRepresentingColors = newHue;
  }
  // ...
}

class Exercise11{
  public static void main(String[] args){
    AllTheColorsOfTheRainbow color = new AllTheColorsOfTheRainbow();
    color.anIntegerRepresentingColors = 10;
    System.out.println("Original hue = " + color.anIntegerRepresentingColors);
    color.changeTheHueOfTheColor(20);
    System.out.println("new hue = " + color.anIntegerRepresentingColors);
  }
}
