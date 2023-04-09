function solution(my_string) {
    var answer = '';
    for (let a of my_string) {
        if (a === a.toUpperCase()) answer += a.toLowerCase();
        else answer += a.toUpperCase();
    }
    return answer;
}