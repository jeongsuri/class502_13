import { useState, useEffect, useRef } from 'react';

const JoinForm = () => {
  const [form, setForm] = useState({}); //폼자체
  let userIdEl = useRef();
  useEffect(() => {
    //userIdEl.focus();
    userIdEl.current.focus();
  }, [userIdEl]);
  const onChange = (e) => {
    //form[e.currentTarget.name] = e.currentTarget.value;
    //setForm({ ...form, [e.currentTarget.name]: e.currentTarget.value });
    //set을 사용해서 변화감지를 주어야 페이지도 다시 랜더링.
    //setForm=setForm은 값은 변경되지만, 주소값은 변경되지않는다.
    //랜더링은 주소값으로 비교하기 떄문에 setform에 새로운객체를 넣어야
    // 새로운객체가 생성되기 떄문에 주소와 값 모두 변경된다.
    const name = e.currentTarget.name;
    const value = e.currentTarget.value;
    setForm((prevForm) => ({ ...prevForm, [name]: value }));
  };
  const onSubmit = (e) => {
    e.preventDefault(); //기본동착 차단(페이지를 이동하지않음)
    //console.log(form);
    setForm({}); //양식 값을 비워주기
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디</dt>
        <dd>
          <input
            type="text"
            name="userId"
            onChange={onChange}
            value={form.userId ?? ''}
            ref={userIdEl}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            name="userPw"
            onChange={onChange}
            value={form.userPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input
            type="password"
            name="confirmPw"
            onChange={onChange}
            value={form.confirmPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input
            type="text"
            name="userName"
            onChange={onChange}
            value={form.userName ?? ''}
          />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  );
};

export default JoinForm;
