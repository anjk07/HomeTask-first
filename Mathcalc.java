package prechec;

public class Mathcalc {

	public static void main(String[] args) {
		{
	        //here diameter are given so we are finding the radius		
			double diametersun = 865000.0;
			double diameterearth = 7600.0;
			double radiussun = diametersun/2;
			double radiusearth = diameterearth/2;
		
		    //here we are calculating the volume
			double volumeofearth = (4.0/3.0)* Math.PI * Math.pow(radiusearth,3);
			double volumeofsun = (4.0/3.0)* Math.PI * Math.pow(radiussun,3);
			
			//here we are calculating the ratio
			double ratio = volumeofsun/volumeofearth ;
				
			//here we are printing the output
			System.out.println("Volume of earth"+ " " +volumeofearth + " "+ "cubic miles");
			System.out.println("Volume of sun"+" " + volumeofsun + " "+ "cubic miles");
			System.out.println("Ratio"+" "+ ratio);	
		}

	}


}
