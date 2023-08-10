package com.dz.logical.string;

public class ReverseSentence {

	public static void main(String[] args) {

//		String sentence="Hi amit how are you.I m from chandrapur.i have completed my engineering from rcert ";
//		String sentence = "hellow friends welcome to my home";
		String sentence = "i love india";

		//reverse each word in sentence.
		String[] split1 = sentence.split(" ");
		String reverse1="";
		for(String words:split1) {
			
			//aproch 1
			/*StringBuilder sb=new StringBuilder(words);
			sb.reverse();
			System.out.print(sb+" ");*/
			
			//aproch 2
			String reverse2 = "";
			for (int i = words.length() - 1; i >= 0; i--) {
				reverse2 += words.charAt(i);
			}
			System.out.print(reverse2+" ");
		
			//aproch 3
//			char[] chh = words.toCharArray();
//			for(int j=chh.length-1;j>=0;j--){
//				System.out.print(chh[j]);
//			}
//			System.out.print("\t");
		}
		
	}

	private static void aproch1(String sentence) {

//		aproch1(sentence);

		String[] splitSentence = sentence.split("[.]");

		String revereSentense = "";
		for (int i=splitSentence.length-1;i>=0;i--) {

//			revereSentense+=splitSentence[i] +"  ";
			String[] splitSentence2=sentence.split(" ");
			System.out.println(splitSentence2.length);
			
		}
		System.out.println(revereSentense);

	}
	
	private static void aproch2(String sentence) {

		String[] splitSentence = sentence.split("[.]");

		for (String sentences : splitSentence) {
			StringBuffer sb=new StringBuffer(sentences);
			sb.reverse();
			System.out.println(sb);
		}

	}
}
