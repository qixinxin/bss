package cn.bjtc.dao;

import java.util.List;

import cn.bjtc.model.Actparam;
import cn.bjtc.view.ActparamView;

public interface IActparamDAO {
	
	public int saveActparam(ActparamView view);
	public int updateActparam(ActparamView view);
	public List<Actparam> findAllActparams(ActparamView view);
	public Integer countAllActparams(ActparamView view);

}
