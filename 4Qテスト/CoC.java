	import java.util.Random;
	import java.util.Scanner;
	import java.util.InputMismatchException;


	class CoC{
		public static void main(String[] args) {
			Random rnd = new Random();

			int str = rnd.nextInt(15)+4;
			int con = rnd.nextInt(15)+4;
			int pow = rnd.nextInt(15)+4;
			int dex = rnd.nextInt(15)+4;
			int app = rnd.nextInt(15)+4;
			int siz = rnd.nextInt(9)+10;
			int innt = rnd.nextInt(9)+10;
			int edu = rnd.nextInt(15)+7;
			int db1=str+siz;
			String db2 ;
			if (db1<=12) {
				db2="-1D6";
			}else if(db1<=16){
				db2="-1D4";
			}else if(db1<=24){
				db2="0";
			}else if(db1<=32){
				db2="+1D4";
			}else if(db1<=40){
				db2="1d6";
			}else{
				db2="神話生物";
			}

			int san = pow*5;
			int idea = innt*5;
			int know = edu*5;
			int job=edu*20;
			int hobby=innt*10;
			int hp =con+siz/2;


			//名前を入力
			System.out.println("探索者の名前を入力してください");
			String name = new java.util.Scanner(System.in).nextLine();

			


			for (;;) {
				System.out.println("探索者名:"+name);
				System.out.println("STR:"+str+"\t"+"CON:"+con+"\t"+"DB:"+db2);
				System.out.println("POW:"+pow+"\t"+"DEX:"+dex+"\t"+"初期SAN値:"+san);
				System.out.println("APP:"+app+"\t"+"SIZ:"+siz+"\t"+"アイディア:"+idea);
				System.out.println("INT:"+innt+"\t"+"EDU:"+edu+"\t"+"知識:"+know);
				System.out.println("HP"+hp+"     MP"+pow);
				System.out.println("職業ポイント"+job+"     趣味ポイント"+hobby);
				System.out.println("");
				System.out.println("機能を選んでください");
				System.out.println("1:修正　０:プログラムの終了");
				Scanner scan = new Scanner(System.in);
				int sts;
				int sel1;
				int sel2;
				int yn;
				int select=0;
				 try{
					select = scan.nextInt();
	      			System.out.println(select); 
	    		}catch (InputMismatchException e){
	      			System.out.println("型が違います：" + e);
	    		}if (select== 1) {
					sts = 0;
					if (sts==0) {
						
						System.out.println("修正");
						System.out.println("どれを修正しますか");
						System.out.println("1:STR　2:CON 3:POW 4:DEX 5:APP 6:SIZ 7:INT 8:EDU");
						sel1 = scan.nextInt();
						System.out.println("機能を選んでください");
						System.out.println("1:振り直し 2:数値修正");
						sel2=scan.nextInt();
						if ((sel1==1)&&(sel2==1)) {
							str = rnd.nextInt(15)+4;
							System.out.println("振り直し結果   STR:"+str);
							System.out.println("");
							System.out.println("");	
						}else if ((sel1==1)&&(sel2==2)) {
							for (;;) {
								str=scan.nextInt();
								System.out.println("STR:"+str);
								System.out.println("");
								System.out.println("");	
								if (str>=19) {
									System.out.println("最大値を超えています。やり直してください");
								}else if(str<=2)  {
									System.out.println("最低値を下回っています。やり直してください");
								}else{
									break;
								}
							}
						}else if ((sel1==2)&&(sel2==1)) {
							con = rnd.nextInt(15)+4;
							System.out.println("振り直し結果   CON:"+con);
							System.out.println("");
							System.out.println("");	
						}else if ((sel1==2)&&(sel2==2)) {
							for (;;) {
								con=scan.nextInt();
								System.out.println("CON:"+con);
								System.out.println("");
								System.out.println("");	
								if (con>=19) {
									System.out.println("最大値を超えています。やり直してください");
								}else if(con<=2)  {
									System.out.println("最低値を下回っています。やり直してください");
								}else{
									break;
								}
							}
						}else if ((sel1==3)&&(sel2==1)) {
							pow = rnd.nextInt(15)+4;
							System.out.println("振り直し結果   POW:"+pow);
							System.out.println("");
							System.out.println("");	
							san = pow*5;
						}else if ((sel1==3)&&(sel2==2)) {
							for (;;) {
								pow=scan.nextInt();
								System.out.println("POW:"+pow);
								System.out.println("");
								System.out.println("");	
								san = pow*5;
								if (pow>=19) {
									System.out.println("最大値を超えています。やり直してください");
								}else if(pow<=2)  {
									System.out.println("最低値を下回っています。やり直してください");
								}else{
									break;
								}
							}
						}else if ((sel1==4)&&(sel2==1)) {
							dex = rnd.nextInt(15)+4;
							System.out.println("振り直し結果   DEX:"+dex);
							System.out.println("");
							System.out.println("");	
						}else if ((sel1==4)&&(sel2==2)) {
							for (;;) {
								dex=scan.nextInt();
								System.out.println("DEX:"+dex);
								System.out.println("");
								System.out.println("");	
								if (dex>=19) {
									System.out.println("最大値を超えています。やり直してください");
								}else if(dex<=2)  {
									System.out.println("最低値を下回っています。やり直してください");
								}else{
									break;
								}
							}
						}else if ((sel1==5)&&(sel2==1)) {
							app = rnd.nextInt(15)+4;
							System.out.println("振り直し結果   APP:"+app);
							System.out.println("");
							System.out.println("");	
						}else if ((sel1==5)&&(sel2==2)) {
							for (;;) {
								app=scan.nextInt();
								System.out.println("APP:"+app);
								System.out.println("");
								System.out.println("");	
								if (app>=19) {
									System.out.println("最大値を超えています。やり直してください");
								}else if(app<=2)  {
									System.out.println("最低値を下回っています。やり直してください");
								}else{
									break;
								}
							}
						}else if ((sel1==6)&&(sel2==1)) {
							siz = rnd.nextInt(15)+4;
							System.out.println("振り直し結果   SIZ:"+siz);
							System.out.println("");
							System.out.println("");	
						}else if ((sel1==6)&&(sel2==2)) {
							for (;;) {
								siz=scan.nextInt();
								System.out.println("SIZ:"+siz);
								System.out.println("");
								System.out.println("");	
								if (siz>=19) {
									System.out.println("最大値を超えています。やり直してください");
								}else if(siz<=2)  {
									System.out.println("最低値を下回っています。やり直してください");
								}else{
									break;
								}
							}
						}else if ((sel1==7)&&(sel2==1)) {
							innt = rnd.nextInt(15)+4;
							System.out.println("振り直し結果   INT:"+innt);
							System.out.println("");
							System.out.println("");	
							idea = innt*5;
						}else if ((sel1==7)&&(sel2==2)) {
							for (;;) {
								innt=scan.nextInt();
								System.out.println("INT:"+innt);
								System.out.println("");
								System.out.println("");	
								idea = innt*5;
								if (innt>=19) {
									System.out.println("最大値を超えています。やり直してください");
								}else if(innt<=2)  {
									System.out.println("最低値を下回っています。やり直してください");
								}else{
									break;
								}
							}
						}else if ((sel1==8)&&(sel2==1)) {
							edu = rnd.nextInt(15)+7;
							System.out.println("振り直し結果   EDU:"+edu);
							System.out.println("");
							System.out.println("");	
							know = edu*5;
						}else if ((sel1==8)&&(sel2==2)) {
							for (;;) {
								edu=scan.nextInt();
								System.out.println("EDU:"+edu);
								System.out.println("");
								System.out.println("");	
								know = edu*5;
								if (edu>=22) {
									System.out.println("最大値を超えています。やり直してください");
								}else if(edu<=5)  {
									System.out.println("最低値を下回っています。やり直してください");
								}else{
									break;
								}
							}
						} else{
							System.out.println("正しい値を入力してください");
						}
					}
				} else if (select==0) {
					System.out.println("終了します");
			  		break;
				}else{
					System.out.println("正しい値を入力してください");

				}
			}
		}
	}