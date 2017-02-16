			import java.util.Random;
			import java.util.Scanner;
			import java.util.HashMap;
			import java.util.Iterator;
			import java.util.InputMismatchException;
			import java.io.File;
			import java.io.IOException;
			import java.io.FileWriter;
			import java.io.BufferedWriter;

			class testCoC3{
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
					int hp =(con+siz)/2;
					HashMap<String, Integer> hm = new HashMap<String, Integer>();
					int sel=0;
					int val=0;
					String fileName;
					int initial=0;

					//名前を入力
					System.out.println("探索者の名前を入力してください");
					String name = new java.util.Scanner(System.in).nextLine();

					


					for (;;) {

						san = pow*5;
						idea = innt*5;
						know = edu*5;
						job=edu*20;
						hobby=innt*10;
						hp =(con+siz)/2;
						System.out.println("  ");
						System.out.println("探索者名:"+name);
						System.out.println("STR:"+str+"\t"+"CON:"+con+"\t"+"DB:"+db2);
						System.out.println("POW:"+pow+"\t"+"DEX:"+dex+"\t"+"初期SAN値:"+san);
						System.out.println("APP:"+app+"\t"+"SIZ:"+siz+"\t"+"アイディア:"+idea);
						System.out.println("INT:"+innt+"\t"+"EDU:"+edu+"\t"+"知識:"+know);
						System.out.println("HP"+hp+"     MP"+pow);
						System.out.println("職業ポイント"+job+"     趣味ポイント"+hobby);
						System.out.println("-----技能-----");
						Iterator<String> it=hm.keySet().iterator();
		       			while(it.hasNext()){
		    				    Object obj=it.next();
		      					System.out.println(obj+" :"+hm.get(obj));
		        				System.out.println("  ");
			   			}

						System.out.println("");
						System.out.println("機能を選んでください");
						System.out.println("1:ステータス修正 2:技能の編集 3:ステータスの保存 0:プログラムの終了");
						Scanner scan = new Scanner(System.in);
						int sts;
						int sel1=0;
						int sel2=0;
						int yn;
						int select=10;
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
								try{
									sel1= scan.nextInt();
			      					System.out.println(sel1); 
			    					}catch (InputMismatchException e){
			      					System.out.println("型が違います：" + e);
			    			   }System.out.println("機能を選んでください");
								System.out.println("1:振り直し 2:数値修正");
								try{
									sel2= scan.nextInt();
			      					System.out.println(sel2); 
			    					}catch (InputMismatchException e){
			      					System.out.println("型が違います：" + e);
			    			   }
								if ((sel1==1)&&(sel2==1)) {
									str = rnd.nextInt(15)+4;
									System.out.println("振り直し結果   STR:"+str);
									System.out.println("");
									System.out.println("");	
								}else if ((sel1==1)&&(sel2==2)) {
									for (;;) {
									try{
										str= scan.nextInt();
			      						System.out.println(str); 
			    					}catch (InputMismatchException e){
			      						System.out.println("型が違います：" + e);
			      						break;
			    					}
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
										try{
										con= scan.nextInt();
			      						System.out.println(con); 
			    					}catch (InputMismatchException e){
			      						System.out.println("型が違います：" + e);
			      						break;
			    					}
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
										try{
										pow= scan.nextInt();
			      						System.out.println(pow); 
			    					}catch (InputMismatchException e){
			      						System.out.println("型が違います：" + e);
			      						break;
			    					}
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
										try{
										dex= scan.nextInt();
			      						System.out.println(dex); 
			    					}catch (InputMismatchException e){
			      						System.out.println("型が違います：" + e);
			      						break;
			    					}
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
										try{
										app= scan.nextInt();
			      						System.out.println(app); 
			    					}catch (InputMismatchException e){
			      						System.out.println("型が違います：" + e);
			      						break;
			    					}
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
										try{
										siz= scan.nextInt();
			      						System.out.println(siz); 
			    					}catch (InputMismatchException e){
			      						System.out.println("型が違います：" + e);
			      						break;
			    					}
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
										try{
										innt= scan.nextInt();
			      						System.out.println(innt); 
			    					}catch (InputMismatchException e){
			      						System.out.println("型が違います：" + e);
			      						break;
			    					}
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
										try{
										edu= scan.nextInt();
			      						System.out.println(edu); 
			    					}catch (InputMismatchException e){
			      						System.out.println("型が違います：" + e);
			      						break;
			    					}
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
						}else if (select==2){
							for (;;) {
				System.out.println("技能名を入力してください");
				String target = new java.util.Scanner(System.in).nextLine();

				if (hm.containsKey(target)) {
					System.out.println("取得済みです");
					System.out.println("削除しますか？　　はい:0  いいえ:1");
					try{
							sel = scan.nextInt();
			      			System.out.println(sel); 
			    		}catch (InputMismatchException e){
			      			System.out.println("型が違います：" + e);
			    		}
					if (sel==0) {
						int data=hm.get(target);
						job=job+data;
						hm.remove(target);			
					}else{
						System.out.println("キャンセルしました");
					}
				}else{
					System.out.println("  ");
					System.out.println("残り職業ポイント"+job);
					System.out.println("残り趣味ポイント"+hobby);
					System.out.println("  ");
					System.out.println("どちらのポイントを使用するか選んでください");
					System.out.println("職業ポイント:1 趣味ポイント:2");
					try{
							sel = scan.nextInt();
			      			System.out.println(sel); 
			    		}catch (InputMismatchException e){
			      			System.out.println("型が違います：" + e);
			    		}
			    	for (; ; ) {
			    			System.out.println("初期能力値を入力してください");
							try{
								initial = scan.nextInt();
				      			System.out.println(val); 
				    		}catch (InputMismatchException e){
				      			System.out.println("型が違います：" + e);
				      			initial=1;
				      			break;
				    		}
				    			if (initial>=100) {
				    				System.out.println("技能値が高すぎます、やり直してください");
			    				}else if (initial<=0) {
									System.out.println("技能値が低すぎます、やり直してください");			    					
			    				}else{
			    				break;
			    				}
			    		}
					if (sel==1) {
			    		System.out.println("残り職業ポイント"+job);
			    		System.out.println(target+":初期値 "+initial);
						System.out.println("技能点を入力してください");
						try{
							val = scan.nextInt();
			      			System.out.println(val); 
			    		}catch (InputMismatchException e){
			      			System.out.println("型が違います：" + e);
			    		}
			    		job=job+initial;
						for (;;) {
							if (val>=100) {
								System.out.println("数値が大きすぎます。やり直してください");
							try{
								val = scan.nextInt();
			      				System.out.println(val); 
			    				}catch (InputMismatchException e){
			      				System.out.println("型が違います：" + e);
			    				}
							}else if (val<=-1) {
								System.out.println("数値が小さすぎます。やり直してください");
								try{
								val = scan.nextInt();
			      				System.out.println(val); 
			    				}catch (InputMismatchException e){
			      				System.out.println("型が違います：" + e);
			    				}
							}else {
								job=job-val;
								if (job<=-1) {
								System.out.println("残り職業ポイントが足りないので、これ以上登録できません");
								job=job+val;
								break;
								}else if(val>=1){
								System.out.println("登録しました");
								hm.put(target,val);
								int data=hm.get(target);
								System.out.println(target+":"+data);
								break;
								}else{
									System.out.println("正しい数値を入力してください");
									break;
								}
							}
						}
					}else if (sel==2) {
						System.out.println("残り趣味ポイント"+hobby);
						System.out.println(target+":初期値 "+initial);
						System.out.println("技能点を入力してください");
						hobby=hobby+initial;
						try{
								val = scan.nextInt();
			      				System.out.println(val); 
			    				}catch (InputMismatchException e){
			      				System.out.println("型が違います：" + e);
			    				}
							for (;;) {
							if (val>=100) {
								System.out.println("数値が大きすぎます。やり直してください");
								try{
								val = scan.nextInt();
			      				System.out.println(val); 
			    				}catch (InputMismatchException e){
			      				System.out.println("型が違います：" + e);
			    				}
							}else if (val<=0) {
								System.out.println("数値が小さすぎます。やり直してください");
								try{
								val = scan.nextInt();
			      				System.out.println(val); 
			    				}catch (InputMismatchException e){
			      				System.out.println("型が違います：" + e);
			    				}
							}else {
								hobby=hobby-val;
								if (hobby<=-1) {
								System.out.println("ポイントが足りないので、これ以上登録できません");
								hobby=hobby+val;
								break;
							}else if(val>=1){
								System.out.println("登録しました");
								hm.put(target,val);
								int data=hm.get(target);
								System.out.println(target+":"+data);
								break;
								}else{
								 System.out.println("正しい数値を入力してください");
								}
							}
						}
					}else{
						System.out.println("正しい数値を入力してください");
					}

				}
					System.out.println("  ");
					System.out.println("残り職業ポイント"+job);
					System.out.println("残り趣味ポイント"+hobby);
					System.out.println("----------");
					it=hm.keySet().iterator();
		       		while(it.hasNext()){
			        Object obj=it.next();
			        System.out.println(obj+" :"+hm.get(obj));
		    	    System.out.println("  ");
				   	}
				   	System.out.println("技能の編集を終了しますか？　　はい:1 いいえ:2");
			        try{
						sel = scan.nextInt();
				     	System.out.println(sel); 
				   	}catch (InputMismatchException e){
				     	System.out.println("型が違います：" + e);
				    }
		        	if (sel==1) {
		        		break;
		        	}
				}
						}else if (select==3) {

						System.out.println("ファイル名を入力してください");

						fileName=new java.util.Scanner(System.in).nextLine();

	       				File file = new File(fileName+".txt");

		      			if ( file.exists() ) {
	        			    System.out.println("そのファイルは既に存在します");
	        				}

	      				try{
	        			    if ( file.createNewFile() ) {
	        			  		String path = file.getPath();
	                			System.out.println(path+"を作成");
	           				}else{
	                			System.out.println("ファイルの作成に失敗");
	            			}
	        			}catch(IOException e){
	 				    	   	System.out.println(e);
	  				   	}

	  				   	 try{
						      if (checkBeforeWritefile(file)){
   					  			   BufferedWriter bw = new BufferedWriter(new FileWriter(file));

					 			      	bw.write("STR:"+str+"\t"+"CON:"+con+"\t"+"DB:"+db2);
								        bw.newLine();
								        bw.write("POW:"+pow+"\t"+"DEX:"+dex+"\t"+"初期SAN値:"+san);
			    					    bw.newLine();
			    					    bw.write("APP:"+app+"\t"+"SIZ:"+siz+"\t"+"アイディア:"+idea);
			    					    bw.newLine();
			    					    bw.write("INT:"+innt+"\t"+"EDU:"+edu+"\t"+"知識:"+know);
			    					    bw.newLine();
			    					    bw.write("HP"+hp+"     MP"+pow);
			    					    bw.newLine();
			    					    bw.write("---------------技能---------------");
			    					    bw.newLine();
			    					    it=hm.keySet().iterator();
		     					  		while(it.hasNext()){
			 							       Object obj=it.next();
			 							       bw.write(obj+" :"+hm.get(obj));
		    								   bw.newLine();
									   	}

								        bw.close();
						      }else{
						        System.out.println("ファイルに書き込めません");
						      }
  						  }catch(IOException e){
 						     System.out.println(e);
  						  }


						}else if (select==0) {
							System.out.println("終了します");
					  		break;
						}else{
							System.out.println("正しい値を入力してください");

						}
					}
				}
				 private static boolean checkBeforeWritefile(File file){
    if (file.exists()){
      if (file.isFile() && file.canWrite()){
        return true;
      }
    }

    return false;
  }
}
