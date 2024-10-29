
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


class Study2 {
    public int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)) return 1;

        return answer;
    }

}


//문제 설명
//부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 예를 들어, 문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 "banana"의 부분 문자열이지만, "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.
//
//문자열 my_string과 target이 매개변수로 주어질 때, target이 문자열 my_string의 부분 문자열이라면 1을, 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
//
//        제한사항
//1 ≤ my_string의 길이 ≤ 100
//my_string은 영소문자로만 이루어져 있습니다.
//        1 ≤ target의 길이 ≤ 100
//target은 영소문자로만 이루어져 있습니다.
//입출력 예
//my_string	target	result
//"banana"	"ana"	1
//        "banana"	"wxyz"	0
//입출력 예 설명
//입출력 예 #1
//
//문제 설명과 같습니다.
//입출력 예 #2
//
//문제 설명과 같습니다.
