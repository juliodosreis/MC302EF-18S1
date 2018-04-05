public class Main{
	public static void main(String[] args){
		Fruta fruta = new Banana();

		if(fruta instanceof Banana){
			((Banana) fruta).descascar();
		}

		MeuArray meuArray = new MeuArray();

		meuArray.add(new Banana());

		for(Fruta banana : meuArray){
			((Banana) fruta).descascar();
		}
	}
}