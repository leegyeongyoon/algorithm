
//문제 설명
//정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
//
//        제한사항
//3 ≤ num_list의 길이 ≤ 100
//        1 ≤ num_list의 원소 ≤ 100
//        1 ≤ n ≤ 100
//입출력 예
//num_list	n	result
//[1, 2, 3, 4, 5]	3	1
//        [15, 98, 23, 2, 15]	20	0
//입출력 예 설명
//입출력 예 #1
//
//        [1, 2, 3, 4, 5] 안에 3이 있으므로 1을 return합니다.
//입출력 예 #2
//
//        [15, 98, 23, 2, 15] 안에 20이 없으므로 0을 return합니다.


class Study3 {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }

}


//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
//
//제한사항
//-50000 ≤ num1 ≤ 50000
//        -50000 ≤ num2 ≤ 50000
//입출력 예
//num1	num2	result
//2	3	-1
//        100	2	98
//입출력 예 설명
//입출력 예 #1
//
//num1이 2이고 num2가 3이므로 2 - 3 = -1을 return합니다.
//입출력 예 #2
//
//num1이 100이고 num2가 2이므로 100 - 2 = 98을 return합니다.