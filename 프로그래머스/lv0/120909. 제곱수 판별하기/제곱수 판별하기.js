function solution(n) {
    let m = Math.floor(Math.sqrt(n));
    if (m * m === n) return 1;
    else return 2;
}