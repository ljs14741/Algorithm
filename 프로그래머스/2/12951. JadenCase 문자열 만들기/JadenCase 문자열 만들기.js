function solution(s) {
    var answer = '';
    let result = s.split(' ');
    console.log('result' + result);
   let result2 = result.map(x=> x.charAt(0).toUpperCase() + x.slice(1).toLowerCase());

   answer = result2.join(" ")
    return answer;
}