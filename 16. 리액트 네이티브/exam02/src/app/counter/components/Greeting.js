import React from 'react';

const Greeting = ({ name, age, children }) => {
  //console.log(props)

  age = age ?? 20;
  //console.log('props', props);
  return (
    <div>
      <h1>{name}님, 안녕하세요.</h1>
      <h2>나이는 : {age} </h2>
      <div>{children(100)}</div>
      {/*<div>{children}</div>*/}
    </div>
  );
};

/*
Greeting.defaultProps = {
  age: 20,
};
 */

export default Greeting;
