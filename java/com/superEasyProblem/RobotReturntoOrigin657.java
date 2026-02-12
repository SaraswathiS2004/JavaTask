package com.superEasyProblem;

public class RobotReturntoOrigin657 {
    public boolean judgeCircle(String moves) {
        int leftRight = 0;
        int upDown = 0;
        for(int i = 0; i< moves.length(); i++){
            char c=moves.charAt(i);
            if(c =='U'){
                upDown++;
            }
            else if(c == 'D'){
                upDown --;
            }
            else if(c == 'L'){
                leftRight ++;
            }
            else if(c =='R'){
                leftRight --;
            }
        }
        if(leftRight == 0 && upDown == 0) return true;
        else return false;
    }
}
