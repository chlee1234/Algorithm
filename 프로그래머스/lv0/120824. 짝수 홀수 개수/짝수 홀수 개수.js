function solution(num_list) {
    let even = 0;
    for (var num of num_list) {
        if (num % 2 === 0) even++;
    }
    var answer = [even, num_list.length - even];
    return answer;
}