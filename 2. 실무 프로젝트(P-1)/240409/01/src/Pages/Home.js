import React from "react";
import { Link, Navigate } from "react-router-dom";
import MessageBox from "../comoons/MessageBox";
import styled from "styled-components";

const MessageBox2 = styled(MessageBox)`
  background: orange;
`;

const Home = () => {
  //const result = true;
  //if(result){
  //    return <Navigate to="/about" replace={true} />;
  //}
  return (
    <div>
      <h1>HOME</h1>
      <div>메인페이지</div>
      <div>
        <Link to="/about">회사소개</Link>
      </div>
      <MessageBox2>메세지</MessageBox2>
    </div>
  );
};
export default React.memo(Home);
