import { useEffect } from 'react';
import { MdOutlineAdd } from 'react-icons/md';

const AddTodo2 = ({ onSubmit,state,dispatch}) => {
  

  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input type="text" val={state.todo} onChange={dispatch({type:'INPUT'})} />
      <button type="submit">
        <MdOutlineAdd />
      </button>
    </form>
  );
};

export default AddTodo2;