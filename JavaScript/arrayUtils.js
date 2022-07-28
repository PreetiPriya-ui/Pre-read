function lengthFunction(arr)
{
    let length=0;
    for(i in arr)
    {
        length++;
    }
    return length;
}


// Map function creates a new array from calling a function for every array elements 

function myMapFunction(arr,callback)
{
    mappedArray=[]
    for(let i=0;i<lengthFunction(arr);i++)
    {
        mappedArray.push(callback(arr[i]));

    }
    return mappedArray;

}

// filter function creates a new array filled with elements that pass a test provided by a function

function myFilterFunction(arr,callback)
{

    filteredArray=[]
    for(let i=0;i<lengthFunction(arr);i++)
    {
        if(callback(arr[i])==true)
        filteredArray.push(arr[i]);
    }
    return filteredArray;
}

// Reduce executes a reducer function for array element. It will return a single value

function myReduceFunction(arr,callback)
{
    let total=0
    for(let i=0;i<lengthFunction(arr);i++)
    {
        total=callback(total,arr[i]);
    }
    return total;
}

// ForEach method calls a function for each element in an array. 

function myForEachFunction(arr,callback)
{
    for(let i=0;i<lengthFunction(arr);i++)
    {
        arr[i]=callback(arr[i]);
        console.log(arr[i])
    }
}

let arr=[1,2,3,4,5,6,20,40,17]
console.log(myMapFunction(arr,(num)=>num*2));
console.log(myFilterFunction(arr,(num)=> num>15));
console.log(myReduceFunction(arr,(a,b)=>a+b));
myForEachFunction(arr,(num)=>num+2)