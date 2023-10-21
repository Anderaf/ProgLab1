import java.text.DecimalFormat;

public class Main 
{
  public static void main(String[] args)
  {
    long[] c = {6, 8, 10, 12, 14, 16, 18};
    float[] x = new float[20];
    float min = -13;
    float max = 9;

    for(int i = 0; i < x.length; i++) 
    {
    	  x[i] = min + (float)(Math.random() * ((max - min) + 1));
    }

    double[][] resultArray = new double[7][20];
    for (int i = 0; i < resultArray.length; i++) 
    {
    	for (int j = 0; j < resultArray[i].length; j++) 
      	{
    	double result; 

        switch ((int)c[i]) 
        {
        	case 8:
        		result = Math.asin(Math.pow(Math.E, Math.cbrt(-Math.pow(2 * Math.abs(x[j]), 2))));
        		break;

        	case 12, 16, 18:
        		result = (1.0/3.0 + 2 * Math.pow(x[j] * (0.25 - x[j]), x[j]))/(Math.pow( (2.0/3.0) / Math.pow(x[j], (x[j]+4) / 0.5), 2) );
        		break;

		default:
			result = Math.pow(2 * Math.pow(((Math.atan(Math.sin(x[j])) - 0.5)/1.0)/3.0, 3), Math.cbrt(Math.pow(Math.cos(x[j])/3.0, 2)));
			break;
        }

        	resultArray[i][j] = result;
	     	System.out.printf( "%.3f ", resultArray[i][j]);
      	}
        
    	System.out.println();
    }
  }
}
