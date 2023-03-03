package chapter05_arr;

public class Ex07 {

	public static void main(String[] args) {
		int [][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		int koreaTotal = 0;
		int englisthTotal = 0;
		int mathTotal =0;
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		for(int i = 0 ; i < score.length ; i++) {
			System.out.print((i+1)+"\t");
			int tempSum = 0;
			int cnt = 0;
			for(int j = 0 ; j < score[i].length ; j++) {
				cnt = score[i].length;
				tempSum += score[i][j];
				if(j==0) koreaTotal+=score[i][j];
				else if(j==1) englisthTotal+=score[i][j];
				else if(j==2) mathTotal+=score[i][j];
				System.out.print(score[i][j]+"\t");
				
			};
			System.out.print((double)tempSum+"\t");
			System.out.print((double)tempSum/cnt+"\t");
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		System.out.println("총점.\t"+koreaTotal+"\t"+englisthTotal+"\t"+mathTotal);
		
	}

}
