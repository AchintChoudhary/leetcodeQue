class Solution {
   int total[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
    int aliceArrive=getday(arriveAlice);
    int bobArrive=  getday(arriveBob);

    int aliceLeave=getday(leaveAlice);
    int bobLeave=getday(leaveBob);

int start=Math.max(bobArrive,aliceArrive);
int end=Math.min(aliceLeave,bobLeave);
return Math.max(0, end-start+1);

    }
public int getday(String date){
int day=Integer.parseInt(date.substring(3, 5));
int month=Integer.parseInt(date.substring(0, 2));

for(int i=0;i<month-1;i++){
    day+=total[i];
}
return day;
}

}