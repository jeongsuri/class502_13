import React from "react";
import { useParams, useLocation, useSearchParams } from 'react-router-dom'

const posts = {
    post1 : {
        subject : '제목1',
        content : '내용1',
    },
    post2 : {
        subject : '제목2',
        content : '내용2'
    }
};

const Board = () => {
    const {id} = useParams();
    const data = posts[`post${id}`];
    const location = useLocation();

//const [searchParams, setSearchParams] = useSearchParams();
//console.log(searchParams.get('key1'));
//setSearchParams("k1=v1&k2=v2");
//console.log(searchParams.toString());
    return(
        <>
            {data ? (
                <>
                    <h1>{data.subject}</h1>
                    <div>{data.content}</div>
                </>
                ) : (
                    <div>게시글이 없습니다.</div>
                )
            }
        </>
    );
};
export default React.memo(Board);
