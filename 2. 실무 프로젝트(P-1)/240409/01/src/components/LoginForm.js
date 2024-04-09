import styled, {css} from 'styled-components';
import { BigButton } from '../comoons/ButtonStyle';

const commonStyle = css`
    width:100%;
`;

const OuterBox = styled.div`
    ${commonStyle}
    position:fixed;
    height:100%;
    left:0;
    top:0;
    display:flex;
    align-items:center;
`

const Inputbox = styled.input`
    ${commonStyle}
    display: block;
    hight: 45x;
    border: 1px solid #ccc;
    border-radius: 3px;
    padding : 10px;
    & + &{// 형제 2,4,6..번쨰만 적용됨.
        margin-top: 5px;
    }
`;

const Formbox = styled.form`
    width : 420px;
    margin : 0 auto; //가운데정렬

    h1{
        text-align: center;
    }
`;



const LoginForm = () => {
    return (
        <>
            <OuterBox>
                <Formbox autoComplete="off">
                    <h1>로그인</h1>
                    <Inputbox type="text" placeholder="아이디"/>
                    <Inputbox type="password" placeholder="비밀번호"/>
                    <BigButton type="submit" selected={true}>로그인</BigButton>
                </Formbox>
            </OuterBox>
        </>
    ); 
};
export default LoginForm;