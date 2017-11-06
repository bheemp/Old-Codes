package com.bheem;

public class SwiggyIne {
	public static String findOut(int N, String str) {
		//int[] arr = {2, 3, 5, 7};
		String out = "";
		StringBuilder sb = new StringBuilder();
		//sb.append(String.valueOf(N));
		for(int i=0; i< str.length()-1; i++) {
			
			int prev = Integer.parseInt(String.valueOf(str.charAt(i)));
			int next = Integer.parseInt(String.valueOf(str.charAt(i+1)));
			if(next < 2) {
				if(prev == 8 || prev == 9) {
				sb.append("7");
				for(int j=i; j<str.length()-1; j++) {
					sb.append("7");
				}
				break;
				}else if(prev == 6) {
					sb.append("5");
					for(int j=i; j<str.length()-1; j++) {
						sb.append("7");
					}
					break;
				}else if(prev == 4) {
					sb.append("3");
					for(int j=i; j<str.length()-1; j++) {
						sb.append("7");
					}
					break;
				}else if(prev == 3){
					sb.append("2");
					for(int j=i; j<str.length()-1; j++) {
						sb.append("7");
					}
					break;
				}
				else if(prev == 5){
					sb.append("3");
					for(int j=i; j<str.length()-1; j++) {
						sb.append("7");
					}
					break;
				}else if(prev == 7){
					sb.append("5");
					for(int j=i; j<str.length()-1; j++) {
						sb.append("7");
					}
					break;
				}
			}else if(next == 4) {
				sb.append("3");
			}else if(next == 6) {
				sb.append("5");
			}else {
				sb.append("7");
			}
		}
		return sb.toString();
		}

	public static void main(String[] args) {
		String b ="500345";
		char a = b.charAt(0);
        int c = Integer.parseInt(String.valueOf(a));
        int value = 0;
        String out = "";
        
        switch(c) {
        case 0: value = 0; break;
        case 1: value = 0; break;
        case 2: value = 0; break;
        case 3: value = 2; break;
        case 4: value = 3; break;
        case 5: value = 2;break;
        case 6: value = 5;break;
        case 7: value = 2;break;
        case 8: value = 7;break;
        case 9: value = 7;break;        
        
        }
        if(value == 2) {
        	out = findOut(c, b);
        	
        }else if(value == 0) {
        	StringBuilder sb = new StringBuilder();
        	
        	for(int i=1; i<b.length(); i++) {
        		sb.append("7");
        	}
        	out = sb.toString();
        	
        }else {
        	StringBuilder sb = new StringBuilder();
        	sb.append(String.valueOf(value));
        	for(int i=1; i<b.length(); i++) {
        		sb.append("7");
        	}
        	out = sb.toString();
        }
System.out.println("String "+out);
	}

}
