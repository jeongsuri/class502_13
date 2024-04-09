import styled, {css} from 'styled-components'

export const BigButton = styled.button`
    height:45px;
    border:0;
    width:100%;
    EN310296095JP
    
    background: orange;
    font-size: 2rem;
    font-weight: bold;
    background: ${({bgcolor}) => bgcolor ?? 'orange'};

    ${({selected, bgcolor}) => selected && css`
        border:1px solid ${bgcolor ?? 'orange'};
        background: #fff;
    `}
`;