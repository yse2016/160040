import java.io.*;

public class CopyByteFile{
	public static void main(String[] args) {
		
	//変数・データを準備する
	FileInputStream in=null;
	FileInputStream in2=null;
	FileOutputStream out =null;

	//ストリーム処理
	//1byteずつ、読み込んで、かく	
	try{
		//ストリームをつくる
		in =new FileInputStream("深淵への招待+.png");
		out =new FileOutputStream("二宮飛鳥.png");
		//データを読み書きする
		int i=0;
		int d;
		while((d=in.read())!=-1){
			out.write(d);
			i++;		
			System.out.println(i+"回");

		}
		System.out.println("コピー終わり");
	}catch(IOException e){
		System.out.println("IOエラーです");
	}finally{
		//ストリームを閉じる
		try{
			in.close();
			out.close();
		}catch(IOException e){
			System.out.println("IOエラーです");
		}
	}
  }
}