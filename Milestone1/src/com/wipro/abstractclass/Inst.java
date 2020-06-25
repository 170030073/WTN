package com.wipro.abstractclass;

abstract class Instrument{
	abstract public void play();
}
class Piano extends Instrument{
	public void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument{
	public void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}
class Guitar extends Instrument{
	public void play() {
		System.out.println("Guitar is playing tin tin tin tin");
	}
}

public class Inst {
	public static void main(String args[]) {
		Instrument ins[]=new Instrument[10];
		for(int i=0;i<10;i++) {
			if(i==1||i==5||i==9)
				ins[i]=new Piano();
			else if(i==3||i==4||i==7)
				ins[i]=new Flute();
			else
				ins[i]=new Guitar();
			ins[i].play();
			if(ins[i] instanceof Piano)
				System.out.println("InstanceOf Piano");
			else if(ins[i] instanceof Flute)
				System.out.println("InstanceOf Flute");
			else
				System.out.println("InstanceOf Guitar");
			System.out.println();
		}
	}

}
