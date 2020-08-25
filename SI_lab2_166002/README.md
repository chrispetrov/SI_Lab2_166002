
				
public class PrimeExample {

    static boolean checkPrime(int n) {

        if (n < 0) { //A

            throw new RuntimeException("Number should not be negative"); //B

        }

        int m = n / 2;  //C

        if (n == 0 || n == 1) {  //D

            return false;  //E

        } else {  //F

            for (int i = 2; i <= m; i++) { //G.1.2.3

                if (n % i == 0) {  //I

                    return true;  //J

                }

            }

            return false;  //K

        }

    } //L

}				

	                             T/F	test case	   Output	
A-B-L	                         F   	-1	  Number should not be negative	
A-C-D-E-L                      	TF   	 1	  FALSE	
A-C-D-F-G.1-G.2-I-J-L          	TTTT	4	TRUE	
A-C-D-F-G.1-G.2-K-L           	TTF	    2	FALSE	
A-C-D-F-G.1-G.2-I-G.3-G.2-K-L	TTTFF	5	FALSE	
A-C-D-F-G.1-G.2-I-G.3-G.2-I-J-L	TTTFTT	9	TRUE	

Za Every path a podeliv programata na 6 pateki i gi testirav so -1 1 4 2 5 9





      n=-1 n=1 n=6	n=3	
A-B	    *				
A-C		    *	*	*	
C-D		    *	*	*	
D-E		    *			
D-F			    *	*	
F-G.1			*	*	
G.1-G.2			*	*	
G.2-I			*		
I-J			    *		
I-G.3			*		
G.2-K				*	

Za every branch prviot test case n=-1 odi kon thrown Exception a n=1 odi kon prviot false
za n=6 i n=3 gi izminuvaat ostanatite granki vo for ciklusot.

CIKLOMATSKATA KOMPLEKSNOST E 5
E-N+2=5


test slucaevite se napisani so assert true so koristenje na vrednostite od tabelite.

