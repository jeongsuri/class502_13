import React, { Component } from "react"; //{Component}을 받으면 클래스형 컴포넌트
import propTypes from "prop-types";

class Buttons2 extends Component {
  static propTypes = {
    color: propTypes.string.isRequired,
  };
  render() {
    const { color, children } = this.props; //비구조할당
    //console.log(Object.getOwnPropertyDescriptors(this.props));
    //console.log(Object.isExtensible(this.props));
    const styles = {
      background: color ?? "black",
    };
    return <button style={styles}>{children}</button>; //children
  }
}

/*
Buttons2.defaultProps = {
  color: "black",
};
*/
/*
Buttons2.propTypes = {
  color: propTypes.string.isRequired, //문자열, 필수항목
};
*/

export default Buttons2;
