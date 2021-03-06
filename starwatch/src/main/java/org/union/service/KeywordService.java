package org.union.service;

import java.sql.SQLException;
import java.util.List;

import org.union.domain.ExtractVO;
import org.union.domain.IssueVO;
import org.union.domain.KeywordListVO;
import org.union.domain.KeywordVO;
import org.union.domain.SearchCriteria;
import org.union.domain.SwearwordVO;

public interface KeywordService {

	
	public KeywordVO view(String keyword) throws SQLException;
	
	public void remove(String keyword) throws SQLException;
	
	public List<KeywordVO> listByUser(Integer user_idx) throws SQLException;
	public List<KeywordVO> getKeyword(String keyword_main) throws SQLException;
	 
	public List<ExtractVO> viewByKeyword(List<ExtractVO> list) throws SQLException;
	
	public List<KeywordVO> listAll() throws SQLException;
	public List<KeywordVO> showboxListAll() throws SQLException;
	
	public List<KeywordListVO> listPage(SearchCriteria cri) throws SQLException;
	
	public void insertMain(KeywordListVO vo) throws SQLException;
	
	public List<KeywordVO> listByMain(String keyword_main) throws SQLException;
	
	public void insertKeyword(KeywordVO vo) throws SQLException;
	
	public Integer checkMain(String keyword_main) throws SQLException;
	
	public Integer checkSwearword(String swearword) throws SQLException;
	
	public void removeMain(String keyword_main) throws SQLException;
	
	public List<SwearwordVO> swearwordList() throws SQLException;

	public void swearwordCreate(SwearwordVO vo) throws SQLException;
	
	public void swearwordDelete(String swearword) throws SQLException;
	
	public void stateUpdateOn(String keyword_main) throws SQLException;
	public void stateUpdateOff(String keyword_main) throws SQLException;
	
	public List<KeywordVO> keywordGetList(SearchCriteria cri) throws SQLException;
	public void createIssue(IssueVO vo) throws SQLException;
	public void issueUpdate(IssueVO vo) throws SQLException;
	public void issueDelete(Integer issue_idx) throws SQLException;
	
	public List<IssueVO> issueList(SearchCriteria cri) throws SQLException;
	public List<IssueVO> issueUpList(SearchCriteria cri) throws SQLException;
}
