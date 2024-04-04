import  {useState, useRef} from 'react';

const Counter = () =>{
    let num = useRef(10);
    console.log(num)
    const [number, setNumber] = useState(0);
    const plus = () => setNumber(num.current++);
    const minus = () => setNumber(number - 1);
    return (
        <>
            <h1>{number}</h1>
            <button type="button" onClick={plus}>+1</button>
            <button type="button" onClick={minus}>-1</button>
        </>
    );
};
export default Counter;