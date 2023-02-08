package Strategy;

import java.nio.file.Path;

public class PathFactory {

  public static PathStrategy getPath(String mode)
  {
      PathStrategy pathStrategy=null;
      switch (mode)
      {
          case "Car":
              pathStrategy=CarPathStrategy.getInstance();
              break;
          case "Bike":
              pathStrategy=BikePathStrategy.getInstance();
              break;
      }
      return pathStrategy;
  }


}
