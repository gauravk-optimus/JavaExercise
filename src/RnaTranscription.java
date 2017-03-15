
public class RnaTranscription {
		public static void main(String[] args){
			String DNA = "ACGTGGTCTTAA",RNA="";
			StringBuilder myDNA = new StringBuilder(DNA);
			for(int i =0; i<DNA.length(); i++){			
				if (myDNA.charAt(i)=='G'){
					myDNA.setCharAt(i,'C');
					}
				else if (myDNA.charAt(i)=='C'){
					myDNA.setCharAt(i,'G');
					}
				else if (myDNA.charAt(i)=='T'){
					myDNA.setCharAt(i,'A');
					}
				else if (myDNA.charAt(i)=='A'){
					myDNA.setCharAt(i,'U');
					}
			}RNA=myDNA.toString();
			System.out.println(RNA);
		}
	}

