function solution(n) {
    var answer = 0;
    const num = n.toString();
    for (let i = 0; i < num.length; i++) {
        answer += parseInt(num[i]);
    }
    return answer;
}