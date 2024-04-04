import { Component } from "react";

class Color extends Component{
    state = {
        color: "blue",
        subColor : "black",
    };

    

    render(){
        const changeColor = (color) => this.setState({color}); //color
        const changeSubColor = (subColor) => this.setState((prevState)=>({...prevState,subColor:color})) //()...)전개연산자를 사용해서 특정속성값만 변경.
        const {color, subColor} = this.state;
        
        return(
            <>
                <div style={{background: color, width:'100px', height:'100px'}}></div>
                <button type="button" onClick={() => changeColor('red')} onContextMenu={() => changeSubColor('red')}>Red</button>
                <button type="button" onClick={() => changeColor('green')} onContextMenu={() => changeSubColor('green')}>Green</button>
                <button type="button" onClick={() => changeColor('orange')} onContextMenu={() => changeSubColor('orange')}>Orange</button>

                <div style={{background:subColor, width:'50px', height:'50px'}}></div>
            </>
        );
    }
}
export default Color;