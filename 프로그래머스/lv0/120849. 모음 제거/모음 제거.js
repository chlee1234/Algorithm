function solution(my_string) {
    var answer = '';
    let arr = ['a', 'e', 'i', 'o', 'u'];
    for (let i = 0; i < my_string.length; i++) {
        if (!arr.includes(my_string[i])) answer += my_string[i];
    }
    return answer;
}