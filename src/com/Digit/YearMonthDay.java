package com.Digit;

class YearMonthDay {
    public static int dayOfYear(String date) {
        String s[] = date.split("-");
        int arr[] = new int[s.length];
        arr[0] = Integer.parseInt(s[0]);
        arr[1] = Integer.parseInt(s[1]);
        arr[2] = Integer.parseInt(s[2]);
        int day =0;
        if(arr[0]%4==0 && arr[0]%100!=0 || arr[0]%400==0){
            for(int i=1;i<arr[1];i++){
                if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                    day = day+31;
                }
                else if(i==2){
                    day = day+29;
                }
                else{
                    day = day+30;
                }
                System.out.print(day+" ");
            }
            
        }
        return day;
    }
    public static void main(String args[]) {
     System.out.print(dayOfYear("2020-04-09"));
	}
}