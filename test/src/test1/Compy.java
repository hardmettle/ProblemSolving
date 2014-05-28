package test1;

public class Compy {
	public static void main(String ar[]){
		int[] a = {1, 2, -1, 3, -2};
		numberOfGifts(a);
	}

    static void numberOfGifts(int[] a) {
        long number_of_gift=0;
        for(int i=0;i < a.length ;i++){
            if(a[i] == 1 || a[i] == -1){
                number_of_gift++;
            }
            if(i == 0){
                long save_sum = 0;
                for(int j = 1 ; j < a.length ; j++){
                    save_sum = save_sum + a[j];
                    if(a[i] + save_sum == 1 || a[i] + save_sum == -1){
                        number_of_gift++;
                    }
                }
            }
            else{
                int ctr = 0;
                while(ctr < i){
                    long save_prev_sum = 0;
                    for(int k = ctr ; k < i ; k++){
                        save_prev_sum += a[k];     
                    }
//                    if(save_prev_sum + a[i] == 1 || save_prev_sum + a[i] == -1){
//                        number_of_gift++;
//                    }
                    if(i != a.length-1){
                        long save_sum2 = 0;
                        for(int l = i+1 ; l < a.length ; l++ ){
                            save_sum2 = save_sum2 + a[l];
                            if(a[i] + save_sum2 + save_prev_sum == 1 || a[i] + save_sum2 + save_prev_sum == -1){
                              number_of_gift++;  
                            }
                        }
                    }
                    ctr++ ;
                }
                if(i != a.length-1){
                    long save_sum3 = 0;
                    for(int m = i+1 ; m < a.length ; m++ ){
                        save_sum3 = save_sum3 + a[m];
                        if(a[i] + save_sum3 == 1 || a[i] + save_sum3 == -1){
                            number_of_gift++;  
                        }
                    }
                }
                
            }
        }
        System.out.println(number_of_gift);
    }


}
