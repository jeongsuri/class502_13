import { useReducer } from "react";
import AddTodo from "../components/AddTodo2";
import TodoList from "../components/TodoList2";


const items = [
    { id: 1, title: '할일1', done: true },
    { id: 2, title: '할일2', done: false },
    { id: 3, title: '할일3', done: false },
  ];

  const todo='';

function reducer(state, dispatch) { // state : 현재 상태값, action - 액션 발생 함수에서 넘겨준 값
    console.log(state,dispatch);
}

const TodoContainer2 = () => {
    const [state, dispatch] = useReducer(reducer, {todo,items}); // state(상태값) dispatch(액션발생함수)
    return (
        <>
            <AddTodo state={state} dispatch={dispatch} />
            <TodoList state={state} dispatch={dispatch} />
        </>
    );
};

export default TodoContainer2;