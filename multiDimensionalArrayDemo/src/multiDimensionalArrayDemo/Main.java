package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String [][]sehirler = new String [3][3];
	
		sehirler[0][0] = "Kütahya";
        sehirler[0][1] = "Eskişehir";
        sehirler[0][2] = "Ankara";
        sehirler[1][0] = "Afyon";
        sehirler[1][1] = "Balıkesir";
        sehirler[1][2] = "Konya";
        sehirler[2][0] = "İzmir";
        sehirler[2][1] = "Muğla";
        sehirler[2][2] = "Aydın";
	
        for (int i=0; i<=2; i++){
            System.out.println("--------------------");
            for (int j=0; j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }

	} 

}
