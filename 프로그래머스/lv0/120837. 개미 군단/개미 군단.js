function solution(hp) {
    var answer = 0;
    let rest = 0;
    let ant = parseInt(hp / 5);
    answer += ant;
    rest = hp % 5;
    answer += parseInt(rest / 3);
    rest = rest % 3;
    answer += rest;
    return answer;
}